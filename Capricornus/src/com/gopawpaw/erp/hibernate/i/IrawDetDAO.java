package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IrawDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IrawDet
 * @author MyEclipse Persistence Tools
 */

public class IrawDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IrawDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IrawDet transientInstance) {
		log.debug("saving IrawDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IrawDet persistentInstance) {
		log.debug("deleting IrawDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IrawDet findById(com.gopawpaw.erp.hibernate.i.IrawDetId id) {
		log.debug("getting IrawDet instance with id: " + id);
		try {
			IrawDet instance = (IrawDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IrawDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IrawDet instance) {
		log.debug("finding IrawDet instance by example");
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
		log.debug("finding IrawDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IrawDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IrawDet instances");
		try {
			String queryString = "from IrawDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IrawDet merge(IrawDet detachedInstance) {
		log.debug("merging IrawDet instance");
		try {
			IrawDet result = (IrawDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IrawDet instance) {
		log.debug("attaching dirty IrawDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IrawDet instance) {
		log.debug("attaching clean IrawDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IrawDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IrawDetDAO) ctx.getBean("IrawDetDAO");
	}
}