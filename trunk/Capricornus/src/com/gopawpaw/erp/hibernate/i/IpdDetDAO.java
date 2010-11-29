package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IpdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IpdDet
 * @author MyEclipse Persistence Tools
 */

public class IpdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IpdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IpdDet transientInstance) {
		log.debug("saving IpdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IpdDet persistentInstance) {
		log.debug("deleting IpdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IpdDet findById(com.gopawpaw.erp.hibernate.i.IpdDetId id) {
		log.debug("getting IpdDet instance with id: " + id);
		try {
			IpdDet instance = (IpdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IpdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IpdDet instance) {
		log.debug("finding IpdDet instance by example");
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
		log.debug("finding IpdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IpdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IpdDet instances");
		try {
			String queryString = "from IpdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IpdDet merge(IpdDet detachedInstance) {
		log.debug("merging IpdDet instance");
		try {
			IpdDet result = (IpdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IpdDet instance) {
		log.debug("attaching dirty IpdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IpdDet instance) {
		log.debug("attaching clean IpdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IpdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IpdDetDAO) ctx.getBean("IpdDetDAO");
	}
}