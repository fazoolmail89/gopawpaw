package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IldDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IldDet
 * @author MyEclipse Persistence Tools
 */

public class IldDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IldDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IldDet transientInstance) {
		log.debug("saving IldDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IldDet persistentInstance) {
		log.debug("deleting IldDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IldDet findById(com.gopawpaw.erp.hibernate.i.IldDetId id) {
		log.debug("getting IldDet instance with id: " + id);
		try {
			IldDet instance = (IldDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IldDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IldDet instance) {
		log.debug("finding IldDet instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding IldDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IldDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IldDet instances");
		try {
			String queryString = "from IldDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IldDet merge(IldDet detachedInstance) {
		log.debug("merging IldDet instance");
		try {
			IldDet result = (IldDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IldDet instance) {
		log.debug("attaching dirty IldDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IldDet instance) {
		log.debug("attaching clean IldDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IldDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IldDetDAO) ctx.getBean("IldDetDAO");
	}
}