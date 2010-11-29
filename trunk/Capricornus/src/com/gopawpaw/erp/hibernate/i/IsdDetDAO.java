package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IsdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IsdDet
 * @author MyEclipse Persistence Tools
 */

public class IsdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IsdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IsdDet transientInstance) {
		log.debug("saving IsdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IsdDet persistentInstance) {
		log.debug("deleting IsdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IsdDet findById(com.gopawpaw.erp.hibernate.i.IsdDetId id) {
		log.debug("getting IsdDet instance with id: " + id);
		try {
			IsdDet instance = (IsdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IsdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IsdDet instance) {
		log.debug("finding IsdDet instance by example");
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
		log.debug("finding IsdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IsdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IsdDet instances");
		try {
			String queryString = "from IsdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IsdDet merge(IsdDet detachedInstance) {
		log.debug("merging IsdDet instance");
		try {
			IsdDet result = (IsdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IsdDet instance) {
		log.debug("attaching dirty IsdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IsdDet instance) {
		log.debug("attaching clean IsdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IsdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IsdDetDAO) ctx.getBean("IsdDetDAO");
	}
}